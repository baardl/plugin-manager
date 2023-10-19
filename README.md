# plugin-manager

Demonstrate how to add plugins to a Java application

## Usage the easy way

```
./run-all.sh
```

## Usage when you want to undersand what is going on

Build all artifacts

```
mvn clean package
```

## Run the application

```
cd plugin-application
java -cp target/plugin-manager-0.1.0-SNAPSHOT.jar no.baardl.plugins.App
```

Expected error:
'java.lang.NoClassDefFoundError: no/baardl/plugins/ingestion/IngestionService'

## Copy needed typelib to classpath

```
cp ../plugin-typelib/target/*.jar libs 
java -cp target/plugin-manager-0.1.0-SNAPSHOT.jar:./libs/*.jar no.baardl.plugins.App
```

Please note the extra ':./libs/*.jar' in the classpath

Expected output:

```
I've found a service called 'SimulatorIngestionService' !
Found 1 services!
```

## Add the extra plugin to your classpath

```
cp ../csv-plugin/target/*.jar libs 
java -cp target/plugin-manager-0.1.0-SNAPSHOT.jar:./libs/*.jar no.baardl.plugins.App
```

Expected output:

```
I've found a service called 'SimulatorIngestionService' !
I've found a service called 'CsvIngestionService' !
Found 2 services!
```

Hurray!
