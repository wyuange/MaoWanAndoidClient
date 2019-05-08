package mao.com.mao_wanandroid_client.view.main.fragment;

import mao.com.mao_wanandroid_client.R;
import mao.com.mao_wanandroid_client.base.fragment.RootBaseFragment;
import mao.com.mao_wanandroid_client.presenter.main.NavigationContract;
import mao.com.mao_wanandroid_client.presenter.main.NavigationPresenter;

/**
 * @author maoqitian
 * @Description
 * @Time 2019/5/8 0008 23:33
 */
public class NavigationFragment  extends RootBaseFragment<NavigationPresenter> implements NavigationContract.NavigationView {

    @Override
    protected int getLayoutId() {
        return R.layout.navigation_fragment_layout;
    }
}