package gr.jchrist.ideaagents;

public class SomeObject {
    private final SomeDependency someDependency;

    public SomeObject(SomeDependency someDependency) {
        this.someDependency = someDependency;
    }

    public String someMethod() {
        return someDependency.doSomething();
    }
}
