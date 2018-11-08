# Java Embedded Python Tutorial

## Setup 🚀 

1. Clone project and import it into the IDE
 - Enable Java SDK on the project
 - If using IntelliJ, make sure you import the project through `File > New > Project from Existing Sources`
 - Create a Run Configuration for the project (In IntelliJ create an `Application` config)
  - Set ``Main class`` as `com.company.Main`
  - Set `Program Arguments` as `-i -Djava.library.path=<PATH-TO-YOUR-JEP-DIRECTORY-IN-PYTHON-LIBS>`
   - The path to your jep directory in python libs may look something like `/usr/local/libs/python2.7/site-packages/jep/`
  - Set enviroment variable `DYLD_LIBRARY_PATH` to the same path as above (something like `/usr/local/libs/python2.7/site-packages/jep/`)
   - You can set this environment variable inside your IDE or in your `.bash_profile` using `export DYLD_LIBRARY_PATH=<YOUR-PATH>` on any line.
2. Now you'll need to link the JEP jar to the project
 - Run `pip install jep` in the project
 - Alternatively, download the JEP source code and then run `python setup.py build install`, the jar file should then be in `jep/build`
  - You may also notice a file either called `jep.so` or `jep.dll`... More on this later.
 - Link the jar file to your project. In IntelliJ you can do this by going to `File > Project Structure > Modules > Dependencies > '+' JARs or directories`

