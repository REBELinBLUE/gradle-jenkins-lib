import org.junit.Test

class fOOTest {
    /**
     * Use Groovy metaclass programming to add methods to the Jenkins pipeline shared library exposed class.
     * This allows for unit testing of classes that makes use of Jenkins pipeline steps, such as
     * 'sh', 'echo' or e.g. other steps available through the workflow-basic-steps-plugin
     */
//    @BeforeClass
//    static void setup() {
//        getAvailablePort.metaClass.echo {
//            println it
//            return it
//        }
//    }

    @Test
    void shouldDoAThing() {
        def varsFile = new foo()
        def actual = varsFile.call('do it')

        assert actual == 'Yay!'
    }
}
