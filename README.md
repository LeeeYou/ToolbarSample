# ToolbarSample
默认情况下，Toolbar和ActionBar在外观上并没有太大的区别，只是说Toolbar更自由了，而不像ActionBar那样有太多系统定制的条条框框。

使用Toolbar分为两种情况：<br>
第一：toolbar结合actionbar<br>
第二：独立使用toolbar<br>

<h2>情况一：toolbar结合actionbar</h2>
1）继承AppCompatActivity<br>
2）xml中引入android.support.v7.widget.Toolbar控件<br>
3）在activity中调用：setSupportActionBar(toolbar)<br><br>

**Toolbar只是个普通的控件，只要你将它写进你的布局它就会存在，而我们调用setSupportActionBar方法的目的是将Toolbar作为ActionBar来对待，仅此而已。当调用setSupportActionBar方法后，Android就会将你的Toolbar当作ActionBar处理并为其设置相关的初始值。**<br><br>

*关于样式的设置，请下载Demo查阅*

<h2>情况二：独立使用toolbar</h2>
1）继承Activity即可<br>
2）直接当作actionbar使用，例如：setTitle，setSubtitle，setNavigationIcon，setLogo，inflateMenu，setOnMenuItemClickListener...<br><br>


总的来说Toolbar是比较简单的控件，在Toolbar推出后很多开发者喜欢将其与ActionBar结合起来使用，也就是情况一所说的使用setSupportActionBar方法将其设置为ActionBar，不过建议，当你将Toolbar作为ActionBar使用后，能用ActionBar原有方法实现的功能尽量用其方法实现，不能实现的再考虑使用Toolbar的方法，举个例子，像菜单构建设置监听什么的，直接使用Activity提供的方法就好了。
