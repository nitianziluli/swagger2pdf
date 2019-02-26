# swagger2pdf

使用springBoot + springFox + swagger2markup + asciidoctorj-pdf，生成HTML和PDF格式的接口文档，也解决了PDF文档中文显示为空白的问题。

关于本项目的一些其他信息，可以看我的[这篇博客](https://blog.csdn.net/u013719669/article/details/80998225)。

# 实现原理：

1. 先利用`SpringFox`库生成`RESTful API`
2. 再利用`Swagger2Markup` Maven插件生成`asciidoc`文档
3. 最后利用`asciidoctor` Maven插件生成 html 或 pdf 文件

# 如何使用本项目

先下载本项目到本地，导入`eclipse`，等待`maven`下载完依赖的`jar包`，即可使用。运行时只需要在项目上右击-->`Run As`-->`Maven clean`-->在项目上右击-->`Run As`-->`Maven test`，只要控制台显示成功，在当前项目的`target\asciidoc\html`和`target\asciidoc\pdf`分别存放着`HTML文档`和`PDF文档`。

> 注意：其他IDE工具没有试过，如需使用，请自行研究。

# 其他说明

为了本项目使用方便，不建议将要生成文档的项目源码整合到本项目，这样做比较麻烦，需要每个项目都加。

比较好的做法是：

- 首先你的项目要确保是`spring boot`的，并且集成了`swagger`，接口层和入参出参实体类加了`swagger`的相关注解，且能正确跑起来；
- 然后将本项目的`src/test/java`下`com.example.swagger2pdf`中的`Swagger2PdfTest`类中的注释放开，将生成当前项目的`swagger.json`的代码注释掉，将`url`中的`ip`和`port`换成自己要生成文档的项目的`ip`和`port`，这里要确保这个`url`直接访问有数据返回，不然是无法生成文档的；
- 最后按上面说的运行项目即可生成文档。
