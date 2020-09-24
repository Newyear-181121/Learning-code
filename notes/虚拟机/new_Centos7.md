1.  修改主机名

    ```
    hostnamectl set-hostname newhostname
    ```

    

2.  修改ip

    ```
    vim /etc/sysconfig/network-scripts/ifcfg-ens160
    ```

    

### postgresql 安装

使用的是：postgresql-10.10.tar.gz

```
# 用户创建
groupadd -g 701 postgres
useradd -u 701 -g postgres postgres

# 准备目录
mkdir -p /apply/postgres/data
mkdir -p /apply/postgres/pgsql
chown -R postgres:postgres /apply/postgres

# 编译安装
yum install -y gcc readline-devel zlib-devel
tar -xvf postgresql-10.10.tar.gz
cd postgresql-10.10/
./configure --prefix=/apply/postgres/pgsql
make
make install
cd contrib && cd postgres_fdw && make && make install
cd .. && cd file_fdw && make && make install
cd .. && cd dblink && make && make install
cd .. && cd pg_stat_statements && make && make install
cd .. && cd pg_trgm && make && make install


# 添加环境变量
echo "export PGDATA=/apply/postgres/data
alias pgstart='pg_ctl -D $PGDATA start'
alias pgstop='pg_ctl -D $PGDATA stop'
export LANG=en_US.utf8" >> /home/postgres/.bash_profile
echo "LD_LIBRARY_PATH=/apply/postgres/pgsql/lib
export LD_LIBRARY_PATH
PATH=/apply/postgres/pgsql/bin:$PATH
export PATH" >> /home/postgres/.bashrc

# 切换到 postgres 用户 ,允许远程访问数据库
su - postgres
echo "listen_addresses = '*' " >> postgresql.conf
echo "host    all             all            0.0.0.0/0         md5"
```

