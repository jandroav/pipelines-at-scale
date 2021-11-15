package org.jenkins.stages

class Build implements Serializable {

  def steps

  Build(steps){
    this.steps = steps
  }

  def mvn(goals) {
    steps.echo "Building with ${goals}"
  }

}