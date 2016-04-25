package pivotal.io.rxkotlinplayground.models

data class Repo(
        val name: String,
        val description: String = "",
        val stargazers_count: Int = 0,
        val watchers_count: Int = 0,
        val language: String = "",
        val url: String)

