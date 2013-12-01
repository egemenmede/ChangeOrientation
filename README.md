ChangeOrientation
=================

ChangeOrientation Plugin (PhoneGap 2.2.0=<3.0.0) 

`ChangeOrientation`, `ANDROID`li cihazlar için `PhoneGap 2.2.0=<3.0.0` sürümlerinde kullanabileceğiniz bir PhoneGap Pluginidir. 

Uygulama içerisinde istediğiniz zaman cihazınızın konumunu Portrait ya da Landscape olarak değiştirmenizi sağlar.


PLUGIN KURULUMU
=================================

1) `changeorientation.js` dosyasını HTML sayfasının içerisine ekleyin.

```
<script type="text/javascript" charset="utf-8" src="changeorientation.js"></script>
```

2) `ChangeOrientationPlugin.java` dosyasını `src` klasöründe olduğu gibi `com.dp.plugin.changeorientation` packageinin altına ekleyin.

3) `res>xml>config.xml` dosyasına plugini aşağıdaki gibi tanımlayın.

```
<feature name="ChangeOrientation">
      <param name="android-package" value="com.dp.plugin.changeorientation.ChangeOrientationPlugin" />
</feature>
```

Sorularınız için;

http://www.delipenguen.com ve PhoneGap/Cordova Geliştiricileri Türkiye Topluluğu (https://plus.google.com/communities/117075673032309282055)
