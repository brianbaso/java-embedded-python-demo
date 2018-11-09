# Java Embedded Python Tutorial

## Setup with MacOS and an IDE 🚀 

1. Clone project and import it into the IDE
 a. Enable Java SDK on the project
 b. If using IntelliJ, make sure you import the project through `File > New > Project from Existing Sources`
2. Create a Run Configuration for the project (In IntelliJ create an `Application` config)
  a. Set ``Main class`` as `com.company.Main`
  b. Set `Program Arguments` as `-i -Djava.library.path=<PATH-TO-YOUR-JEP-DIRECTORY-IN-PYTHON-LIBS>`
   - The path to your jep directory in python libs may look something like `/usr/local/libs/python2.7/site-packages/jep/`
  c. Set enviroment variable `DYLD_LIBRARY_PATH` for MacOS, `LD_LIBRARY_PATH` for Linux, or `PATH` for windows to the same path as above (something like `/usr/local/libs/python2.7/site-packages/jep/` on MacOS)
   - You can set this environment variable inside your IDE or in your `.bash_profile` using `export DYLD_LIBRARY_PATH=<YOUR-PATH>` on any line.
3. Now you'll need to get the JEP jar to the project
 a. Run `pip install jep` in the project
 b. Alternatively, download the JEP source code and then run `python setup.py build install`, the jar file should then be in `jep/build`
4. Link the JEP jar to the project
 a. Link the jar file to your project. In IntelliJ you can do this by going to `File > Project Structure > Modules > Dependencies > '+' JARs or directories`
  - Refresh the project and now `Jep` should be recognized
 b. Instantiate the JEP class and run the project. The python code should execute!
