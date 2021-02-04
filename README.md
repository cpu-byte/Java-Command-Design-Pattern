# Java Command Design Pattern
Complete example of the command design pattern in `Java 10+`

The implementation includes 5 classes. In the example in the repository, `Profile` has a `biography`. The class `SetProfileBiographyCommand` wraps the `Profile`'s `setBiography()` method. The `Profile` is a instance of `Receiver`.

The `main()` method in the `Main` class includes an example where a biography is set a couple of times and then the set is undone, discarding the made changes. The concrete command class inherits the `Command` interface by forcing to override a `execute` method. The `execute` method in the class will initiate the desired notion. The fields and constructor all support the `execute` method by allowing the storage of parameters. Both fields are labelled as `private` because their values won't change after the definition in the constructor.

The image below shows how the design command pattern maps to the examples used in this repository.

![Example](Example.png)

A concern arising from this methodology is how memory intensive this process may be. An easy solution may be to allow a specified number of commands in the history list, e.g. 10. In this case, regarding a specific invoker, there will be 10 Profile objects and 10 String objects stored in memory maximum.

## License

See LICENSE.md for more information.
