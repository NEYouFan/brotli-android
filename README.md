# brotli-android

Brotli 是一个通用的无损压缩算法，它使用了 LZ77 算法的现代变体、Huffman 编码和二阶上下文建模的结合来压缩数据，因而有着媲美当前任何现代通用压缩算法高的压缩率。在速度上它与 deflate 算法类似，但提供了更高的数据密度。Brotli 压缩的数据格式在 [RFC 7932](https://www.ietf.org/rfc/rfc7932.txt) 中定义。

这个项目由 Google 开发，并开源在 GitHub，项目的 [GitHub地址](https://github.com/google/brotli)。

关于 Brotli，还有如下这样一些 link：

[Google 宣布新开源压缩算法 Brotli](https://www.oschina.net/news/66452/google-brotli)

[Google 實習生立大功！每天為 Android 用戶省下 1.5PB 資料傳輸量](https://technews.tw/2017/02/08/intern-impact-brotli-compression-for-play-store-app-downloads/)

[谷歌开源Brotli无损压缩算法，可提高浏览器性能](http://www.ctocio.com/ccnews/19142.html)

[Brotli —— 下一代的 HTTP 服务器压缩](https://coyee.com/article/11281-next-generation-server-compression-with-brotli)

Brotli 被认为是 Web 的下一代压缩算法。

我们自己也对 Brotli 的强大能力做了测试，发现它确实要比 GZIP 强许多。

Brotli 是由 C/C++ 开发的。为了能将这一强大的压缩算法应用在常规的 Android Java 应用中，我们对 brotli 做了这个封装。

整个项目的结构完全遵守 Android Studio的规范。项目中的 brotlij module 是 brotli 的封装，该 module 的 build target 为一个 Android library AAR。将项目导入Android Studio，并正确配置 NDK 地址，可以像常规 Android 工程那样使用。
