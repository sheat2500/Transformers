# transformers
![alt tag](https://github.com/sheat2500/transformers/blob/master/demo/pictures/transformers.jpg?raw=true)
## ViewPager - OptimusPrime 

Animation Type: 
* RotationY

Simple Example
-----
```java
  public class MainActivity extends FragmentActivity {
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OptimusPrime optimusPrime = (OptimusPrime) findViewById(R.id.optimusPrime);
        optimusPrime.setFragments(new Fragment[]{new MyFragment(), new MyFragment(), new MyFragment()});
    }

XML Usage
-----
If you decide to use SlidingMenu as a view, you can define it in your xml layouts like this:
```xml
  <com.lesmtech.transformers.OptimusPrime
        android:id="@+id/optimusPrime"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        transformer:type="rotationY"/>

## ActionBar - RodimusPrime


## ListView - Bumblebee

## Dialog - Ratchet

