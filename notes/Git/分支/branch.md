# 强制修改分支位置

移动分支到指定位置
```shell
git branch -f origin/learn/设计模式 learn/summary
```

移动分支前：

![image-20210323153846284](images/%E5%BC%BA%E5%88%B6%E4%BF%AE%E6%94%B9%E5%88%86%E6%94%AF%E4%BD%8D%E7%BD%AE/image-20210323153846284.png)



移动分支后：

![image-20210323154017966](images/%E5%BC%BA%E5%88%B6%E4%BF%AE%E6%94%B9%E5%88%86%E6%94%AF%E4%BD%8D%E7%BD%AE/image-20210323154017966.png)  


---  


# 从远程仓库获取所有分支

```bash
git branch -r | grep -v '\->' | while read remote; do git branch --track "${remote#origin/}" "$remote"; done
git fetch --all
git pull --all
```