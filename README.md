# PicturePrevious
图片查看器

## 使用方法

数据源必须实现ImagePreviousData接口，如下：
```java
public class ImgeData implements ImgesPreviousTools.ImagePreviousData {

    private String imgUrl;

    public ImgeData(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    @Override
    public String imgUrl() {
        return imgUrl;
    }
}
```

调用方法
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<ImgesPreviousTools.ImagePreviousData> imagePath = new ArrayList<ImgesPreviousTools.ImagePreviousData>();
                imagePath.add(new ImgeData("https://ss0.baidu.com/73F1bjeh1BF3odCf/it/u=1249384428,2908893384&fm=85&s=B3B0E92122F137981D89FC8E0300E0E1"));
                imagePath.add(new ImgeData("https://ss0.baidu.com/73F1bjeh1BF3odCf/it/u=1249384428,2908893384&fm=85&s=B3B0E92122F137981D89FC8E0300E0E1"));
                imagePath.add(new ImgeData("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=772665167,3113295194&fm=58&s=8823C616F4B5D83110DE64530300F0BB&bpow=121&bpoh=75"));
                imagePath.add(new ImgeData("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=236013081,1091860872&fm=58&u_exp_0=3963946762,758555462&fm_exp_0=86&bpow=420&bpoh=600"));
                imagePath.add(new ImgeData("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=236013081,1091860872&fm=58&u_exp_0=3963946762,758555462&fm_exp_0=86&bpow=420&bpoh=600"));
                imagePath.add(new ImgeData("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=236013081,1091860872&fm=58&u_exp_0=3963946762,758555462&fm_exp_0=86&bpow=420&bpoh=600"));
                imagePath.add(new ImgeData("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=236013081,1091860872&fm=58&u_exp_0=3963946762,758555462&fm_exp_0=86&bpow=420&bpoh=600"));

                ImgesPreviousTools.newInstance()
                        .setImgs(imagePath)
                        .start(MainActivity.this);

            }
        });

    }

}
```
## 项目中使用

Add it in your root build.gradle at the end of repositories:
```xml
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency
```xml
dependencies {
	        compile 'com.github.SmilingBoy:PicturePrevious:v1.0'
	}
```

