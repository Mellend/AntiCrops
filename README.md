# AntiCrops

## Description
Bans players from trampling other people's (and their) crops.
The first open-source plugin. 

## Download
1. Download plugin with **[GitHub Releases](https://github.com/Mellend/AntiCrops/releases)**.
2. Put the file `.jar` in folder `plugins` your server **Bukkit/Spigot/Paper**.
3. Restart your server

## For Maintainers
### Code Style
* All code should be [@NullMarked](https://jspecify.dev/docs/user-guide/#nullmarked) by default. That means,
  unless the element is marked with [@Nullable](https://jspecify.dev/docs/user-guide/#nullable-and-nonnull) or [@NullUnmarked](https://jspecify.dev/docs/user-guide/#nullunmarked),
  it should never be ```null```, also see [@CheckReturnValue](https://errorprone.info/bugpattern/CheckReturnValue)!
  See [Applying JSpecify Nullness Annotations](https://jspecify.dev/docs/applying/) for more details.
* Javadocs are preferred to have everywhere: classes, fields, methods, private elements, etc.
* All new packages and classes should have ```@NullMarked``` annotations.
* Also see [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

## License
This project is **Licensed under the** `GPL-3.0 License`. See the [**LICENSE**](LICENSE) file for details.

## Build
1. Clone the repository to yourself using **git using the command**:
   `git clone https://github.com/Mellend/AntiCrops.git <place to copy>`.
2. Open the file using your IDE (In my case **Intellij Idea**).
    * File -> Project Structure -> Artifacts -> “+” -> Jar -> From modules with dependencies.
    * Select in `Jar files from libraries` - copy to the output directory and link via manifest.
    * Click on “**OK**”.
3. From the top menu, select (Same place as **File**).
    * Build -> Build Artifacts -> anticrops:jar -> Build.
    * Wait a couple of seconds.
4. Navigate to `/out/artifacts/anticrops_jar`, find **anticrops.jar** there.
5. That's it, you now have a self-built `.jar`.