package pivotal.io.rxkotlinplayground.api

import pivotal.io.rxkotlinplayground.models.Repo
import pivotal.io.rxkotlinplayground.models.User
import retrofit2.http.*
import rx.Observable

interface GitHubService {

    @GET("users/{user}/repos")
    fun userRepos(@Path("user") user: String): Observable<List<Repo>>

    @GET("users")
    fun users(): Observable<List<User>>
}
