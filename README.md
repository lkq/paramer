
# Paramer

a simple method parameter validation tool


## Usage

~~~
    <dependency>
        <groupId>com.github.lkq</groupId>
        <artifactId>paramer</artifactId>
        <version>0.1.1</version>
    </dependency>
~~~

~~~
    public void someMethod(String strValue, Object objValue) {
        Paramer.requires()
               .notBlank(strValue, "strValue should not be blank")
               .notNull(objValue, "objValue should not be null");
        // do your stuff
    }
~~~