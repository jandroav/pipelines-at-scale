import org.jenkins.stages.Build

def call(String goals) {

    def build = new Build(this)
    build.mvn(goals)

}