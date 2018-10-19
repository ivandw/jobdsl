project_name = "test-jenkins"
repo= "https://github.com/ivandw/jobdsl.git"
repo_name= "repo"


pipelineJob(project_name){
	definition{
	triggers{
		scm('H/1 * * * *')
	}

	cpsScm{
		scm{
			git{
				remote{
				name(repo)
				url(repo)
				}
			}
			scriptPath("Jenkinsfile")

		}
	}
	}
}
