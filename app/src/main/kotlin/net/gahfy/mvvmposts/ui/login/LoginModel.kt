package net.gahfy.mvvmposts.ui.login
import com.google.gson.annotations.SerializedName



data class LoginModel (

		@SerializedName("status") val status : String,
		@SerializedName("login_type") val login_type : String,
		@SerializedName("login_user_id") val login_user_id : Int,
		@SerializedName("name") val name : String,
		@SerializedName("authentication_key") val authentication_authentication_key : String
)