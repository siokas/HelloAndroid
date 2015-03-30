# HelloAndroid
This is the very first app of the Android Development Class, which helps you to use and understand the 3 types of the OnclickListener of a Button and change the text of a TextView programatically.
## Creating new Project in Android Studio
<ol>
<li> Creating an Android Project selecting the first choise "Create New Project" </li>

<img src="https://github.com/solotsopa/HelloAndroid/blob/master/ScreenShots/CreateProject0.png">

<li> Configure your new Project by giving it a new Name, Company Name (usualy stays the same) and Project Location </li>

<img src="https://github.com/solotsopa/HelloAndroid/blob/master/ScreenShots/CreateProject1.png">

<li> Select the form factor your app will run on and also configure the minimum api </li>

<img src="https://github.com/solotsopa/HelloAndroid/blob/master/ScreenShots/CreateProject2.png">

<li> Add a <b>blank</b> Activity to your Project </li>

<img src="https://github.com/solotsopa/HelloAndroid/blob/master/ScreenShots/CreateProject3.png">

<li> The final step is to customize the Activity by giving the Activity Name, Layout Name, Title, Menu Resource Name </li>

<img src="https://github.com/solotsopa/HelloAndroid/blob/master/ScreenShots/CreateProject3.png">

</ol>

## Configure the User Interface (xml file)

At first, you should change the base layout to match parent a <b>LinearLayout</b>
```xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
```



Then add a <b>TextView</b>

```xml
 <TextView
        android:id="@+id/text_view"
        android:text="@string/hello_world"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp" />
```

Finally add 3 button and in the first add an <b>onclick</b> method 

```xml
<Button
        android:id="@+id/change1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/change1"
        android:onClick="changeText1"/>

    <Button
        android:id="@+id/change2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/change2"/>

    <Button
        android:id="@+id/change3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/change3"/>
```

## Configure the java file

To change the TextView text, first deaclare a TextView element and initialize it and after that just call the "setText()" method

```java
  TextView tv = (TextView) findViewById(R.id.text_view);
  tv.setText("Hello Android 1");
```

To create the method that is called from the first button, just create a public void method with the same name that you decleared in the xml file and pass a View argument

```java
    public void changeText1(View view){
        tv.setText("Hello Android 1");
    }
```

The second way to handle the onclick listener of the button is to declare and initiate the Button and set the onlcicklistener passing new OnclickListener as argument which automatically implements for you the onclick unimplement method


```java
Button bt2 = bt2 = (Button) findViewById(R.id.change2);
 bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello Android 2");
            }
        });

```

The third way to handle the onclick listener of buttons is to implement the View.OnClickListener in the class and implement the onclick unimplement method. In the method you may handle which button is pressed by taking the id of the view that is passed in as argument

```java
 @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.change3:
                tv.setText("Hello Android 3");
                break;
        }
    }
```

## Licence

<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">HelloAndroid</span> by <span xmlns:cc="http://creativecommons.org/ns#" property="cc:attributionName">Apostolos SIokas</span> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 International License</a>.

