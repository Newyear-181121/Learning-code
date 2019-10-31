/**
 *思路图
 *
 * 1. 所有的访问都会被web.xml中配置的Struts 的 Filter所拦截
 * 2. 拦截之后，就进入struts的工作流程
 * 3. 访问的地址是/index,根据struts按照 struts.xml中的配置，服务端跳转到index.jsp
 * 4. 显示index.jsp的内容
 *
 */