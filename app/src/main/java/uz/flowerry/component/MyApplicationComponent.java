package uz.flowerry.component;

import com.bumptech.glide.RequestManager;

import dagger.Component;
import retrofit2.Retrofit;
import uz.flowerry.interfaces.MyApplicationScope;
import uz.flowerry.interfaces.RetrofitAnnotations;
import uz.flowerry.module.DataBaseModule;
import uz.flowerry.module.GlideModule;
import uz.flowerry.module.RetrofitModule;

@MyApplicationScope
@Component(modules = {RetrofitModule.class, GlideModule.class, DataBaseModule.class})
public interface MyApplicationComponent {

    @RetrofitAnnotations.RetrofitApp
    Retrofit getRetrofitApp();

    RequestManager getGlideManager();

}
