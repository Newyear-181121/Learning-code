

# 设置字体，大小，颜色

```html
<font face="微软雅黑" size=6 color=#FF0000 >微软雅黑字体</font>
```

<font face="微软雅黑" size=6 color=#FF0000 >微软雅黑字体</font>

:sun_with_face:

<a name="跳01" href="#跳02" target="_blank">任意跳的目的</a>

---



# 调整图像大小

2016年10月19日 通过 typora.io

Typora允许您使用``标签显示图像，也可以用来调整图像的大小。

例如，您可以指定标签的`width`或`height`属性``，或在其`style`属性中设置宽度/高度：

```
<img src="https://www.google.com/doodles/kamma-rahbeks-241st-birthday" width="200px" />

<!--or-->

<img src="https://www.google.com/doodles/kamma-rahbeks-241st-birthday" style="height:200px" />
```

另一个常见用例是，当您插入视网膜图像时，需要将其缩放到“正确”的大小。为此，请`zoom`在其`style`属性中指定一个因素：

```
<img src="https://www.google.com/doodles/kamma-rahbeks-241st-birthday" style="zoom:50%" />
```

您可以在`style`属性中设置其他css 属性：通过Typora编辑或预览时，它们将被忽略，但会影响导出的HTML或PDF。



<img src="http://www.w3.org/html/logo/img/mark-word-icon.png" width="200px" />

## Resize Images

October 19, 2016 by typora.io

Typora allows you to use `` tag for displaying images, which can also be used to adjust the size of images.

For example, you could specify the `width` or `height` attribute of an `` tag, or set the width/height in its `style` attribute:

```
<img src="https://www.google.com/doodles/kamma-rahbeks-241st-birthday" width="200px" />

<!--or-->

<img src="https://www.google.com/doodles/kamma-rahbeks-241st-birthday" style="height:200px" />
```

Another common use case is that when you insert a retina image, you need to scale it to a “correct” size. To do this, specify a `zoom` factor in its `style` attribute:

```
<img src="https://www.google.com/doodles/kamma-rahbeks-241st-birthday" style="zoom:50%" />
```

You can set other css properties in the `style` attribute: they will be ignored when you edit or preview by Typora, but can affect the exported HTML or PDF.



# Html 内嵌 网页框架

<iframe src="http://www.baidu.com"  height="200" width="120" frameborder="0" scrolling="0"></iframe>

---

# 目录使用 [TOC]

[TOC]

---



# 页面内跳转

## 1. 标题跳转

[跳转到目录](#目录使用 [TOC])

## 2. 任意跳转

使用 HTML <a>标签



<a href="#跳01" name="跳02">点击跳转</a>