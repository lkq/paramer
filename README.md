
# Paramer

a simple method parameter validation tool

## Usage
    public void someMethod(String strValue, Object objValue) {
        Paramer.requires()
               .notBlank(strValue, "strValue should not be blank")
               .notNull(objValue, "objValue should not be null");
        // do your stuff
    }
