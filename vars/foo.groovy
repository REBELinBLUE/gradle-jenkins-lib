import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

def call(String skip) {
    if (skip == 'blah') {
        Utils.markStageSkippedForConditional(skip)
    }
    
    return 'Yay!'
}
