package pivotal.io.rxkotlinplayground

import org.junit.Test
import pivotal.io.rxkotlinplayground.api.GitHubService
import pivotal.io.rxkotlinplayground.api.ServiceGenerator.create
import rx.lang.kotlin.subscribeWith

class GitHubServiceTest {

    val url = "https://api.github.com/"
    val service = create(GitHubService::class.java, url)

    @Test
    fun users() {
        service.users().subscribeWith {
            onNext {
                println(it.toString())
            }
        }
    }

    @Test
    fun userRepo() {
        service.userRepos("benjamintanweihao").subscribeWith {
            onNext {
                println(it.toString())
            }
        }
    }

}

