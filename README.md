# JavaAnonymousClass
無名クラス
## 処理
[JavaClassAndObject](https://github.com/xekid78/JavaClassAndObject)の処理を無名クラスにして見ました。

## コード
```
public class Sample45 {

	public static void main(String[] args) {
		Msg msg = new Msg() {
			public void HelloWorld() {
				System.out.println("Hello World");
			}
		};

		msg.HelloWorld();

	}

}

interface Msg {
	public void HelloWorld();
}
```

## 出力結果  
```
Hello World
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
