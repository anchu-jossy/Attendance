package net.gahfy.mvvmposts.network

import LoginModel
import io.reactivex.Observable
import net.gahfy.mvvmposts.model.Post
import retrofit2.http.*

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
    @FormUrlEncoded
    @POST("/login")
    fun getLogin(@Field("email" ) email :String, @Field("password" ) password :String): Observable<LoginModel>





}