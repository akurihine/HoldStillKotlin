# HoldStillKotlin

This is an example using HoldStillTransformer, a custom PageTransformer that holds specifed views still during the ViewPager's swipe.


<br><br>
## Usage
```kotlin
val holdStillTransformer = HoldStillTransformer()
holdStillTransformer.viewIds = setOf(R.id.topTitleSection, R.id.underBar, R.id.image)
pager.setPageTransformer(false, holdStillTransformer)
```
<br><br>
## Notice the background and top bar. They stand still during the swipe.
![ScreenShot](https://media.giphy.com/media/9S3FM4EBSPJU9o8I6P/giphy.gif)
