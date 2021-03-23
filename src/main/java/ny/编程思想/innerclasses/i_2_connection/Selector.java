package innerclasses.i_2_connection;

/**
 *  selecter：选择器
 *  current： 当前
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
