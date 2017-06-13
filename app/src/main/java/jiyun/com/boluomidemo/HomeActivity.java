package jiyun.com.boluomidemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jiyun.com.boluomidemo.fragment.BookFragment;
import jiyun.com.boluomidemo.fragment.JiejieFragment;
import jiyun.com.boluomidemo.fragment.MaimaiFragment;
import jiyun.com.boluomidemo.fragment.MyFragment;
import jiyun.com.boluomidemo.fragment.ShipinFragment;
import jiyun.com.boluomidemo.fragment.ZhuyeFragment;

public class HomeActivity extends AppCompatActivity {

    @Bind(R.id.img_erweima)
    ImageView imgErweima;
    @Bind(R.id.et_susuo)
    EditText etSusuo;
    @Bind(R.id.img_susuo)
    ImageView imgsusuo;
    @Bind(R.id.hoem_bianji)
    ImageView hoemBianji;
    @Bind(R.id.content)
    FrameLayout content;
    @Bind(R.id.shipin_image)
    ImageView shipinImage;
    @Bind(R.id.shipin_text)
    TextView shipinText;
    @Bind(R.id.shipin_layout)
    RelativeLayout shipinLayout;
    @Bind(R.id.book_image)
    ImageView bookImage;
    @Bind(R.id.book_text)
    TextView bookText;
    @Bind(R.id.book_layout)
    RelativeLayout bookLayout;
    @Bind(R.id.zhuye_image)
    ImageView zhuyeImage;
    @Bind(R.id.zhuye_text)
    TextView zhuyeText;
    @Bind(R.id.zhuye_layout)
    RelativeLayout zhuyeLayout;
    @Bind(R.id.jiejie_image)
    ImageView jiejieImage;
    @Bind(R.id.jiejie_text)
    TextView jiejieText;
    @Bind(R.id.jiejie_layout)
    RelativeLayout jiejieLayout;
    @Bind(R.id.maimai_image)
    ImageView maimaiImage;
    @Bind(R.id.maimai_text)
    TextView maimaiText;
    @Bind(R.id.maimai_layout)
    RelativeLayout maimaiLayout;
    @Bind(R.id.my_image)
    ImageView myImage;
    @Bind(R.id.my_text)
    TextView myText;
    @Bind(R.id.my_layout)
    RelativeLayout myLayout;
    @Bind(R.id.activity_home)
    LinearLayout activityHome;
    private ShipinFragment shipinFragment;
    private BookFragment bookFragment;
    private ZhuyeFragment zhuyeFragment;
    private JiejieFragment jiejieFragment;
    private MaimaiFragment maimaiFragment;
    private MyFragment myFragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        fragmentManager = getSupportFragmentManager();
        //第一次启动是选中第2个tab
        setTabSelection(2);
    }

    @OnClick({R.id.img_erweima, R.id.img_susuo, R.id.hoem_bianji, R.id.shipin_layout, R.id.book_layout, R.id.zhuye_layout, R.id.jiejie_layout, R.id.maimai_layout, R.id.my_layout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_erweima:
                break;
            case R.id.img_susuo:
                break;
            case R.id.hoem_bianji:
                break;
            case R.id.shipin_layout:
                setTabSelection(0);
                break;
            case R.id.book_layout:
                setTabSelection(1);
                break;
            case R.id.zhuye_layout:
                setTabSelection(2);
                break;
            case R.id.jiejie_layout:
                setTabSelection(3);
                break;
            case R.id.maimai_layout:
                setTabSelection(4);
                break;
            case R.id.my_layout:
                setTabSelection(5);
                break;
        }
    }

    /**
     * 根据传入的index参数来设置选中的tab页。
     *
     * @param index 每个tab页对应的下标。0表示视频，1表示书城，2表示主页，3表示结界，4表示买买，5表示我的。
     */
    private void setTabSelection(int index) {
        // 每次选中之前先清楚掉上次的选中状态
        clearSelection();
        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);
        switch (index) {
            case 0:
                // 当点击了视频tab时，改变控件的图片和文字颜色
                shipinImage.setImageResource(R.mipmap.movie);
                shipinText.setTextColor(Color.WHITE);
                if (shipinFragment == null) {
                    // 如果shipinFragment为空，则创建一个并添加到界面上
                    shipinFragment = new ShipinFragment();
                    transaction.add(R.id.content, shipinFragment);
                } else {
                    // 如果ShipinFragment不为空，则直接将它显示出来
                    transaction.show(shipinFragment);
                }
                break;
            case 1:
                // 当点击了书城tab时，改变控件的图片和文字颜色
                bookImage.setImageResource(R.mipmap.book);
                bookText.setTextColor(Color.WHITE);
                if (bookFragment == null) {
                    // 如果ContactsFragment为空，则创建一个并添加到界面上
                    bookFragment = new BookFragment();
                    transaction.add(R.id.content, bookFragment);
                } else {
                    // 如果BookFragment不为空，则直接将它显示出来
                    transaction.show(bookFragment);
                }
                break;
            case 2:
                // 当点击了主页ab时，改变控件的图片和文字颜色
                zhuyeImage.setImageResource(R.mipmap.wuzi2);
                zhuyeText.setTextColor(Color.WHITE);
                if (zhuyeFragment == null) {
                    // 如果ZhuyeFragment为空，则创建一个并添加到界面上
                    zhuyeFragment = new ZhuyeFragment();
                    transaction.add(R.id.content, zhuyeFragment);
                } else {
                    // 如果ZhuyeFragment不为空，则直接将它显示出来
                    transaction.show(zhuyeFragment);
                }
                break;
            case 3:
                // 当点击了结界tab时，改变控件的图片和文字颜色
                jiejieImage.setImageResource(R.mipmap.xinxin);
                jiejieText.setTextColor(Color.WHITE);
                if (jiejieFragment == null) {
                    // 如果JiejieFragment为空，则创建一个并添加到界面上
                    jiejieFragment = new JiejieFragment();
                    transaction.add(R.id.content, jiejieFragment);
                } else {
                    // 如果JiejieFragment不为空，则直接将它显示出来
                    transaction.show(jiejieFragment);
                }
                break;
            case 4:
                // 当点击了设置tab时，改变控件的图片和文字颜色
                maimaiImage.setImageResource(R.mipmap.gouwuche);
                maimaiText.setTextColor(Color.WHITE);
                if (maimaiFragment == null) {
                    // 如果maimaiFragment为空，则创建一个并添加到界面上
                    maimaiFragment = new MaimaiFragment();
                    transaction.add(R.id.content, maimaiFragment);
                } else {
                    // 如果maimaiFragment不为空，则直接将它显示出来
                    transaction.show(maimaiFragment);
                }
                break;
            case 5:
            default:
                // 当点击了设置tab时，改变控件的图片和文字颜色
                myImage.setImageResource(R.mipmap.my);
                myText.setTextColor(Color.WHITE);
                if (myFragment == null) {
                    // 如果myFragment为空，则创建一个并添加到界面上
                    myFragment = new MyFragment();
                    transaction.add(R.id.content, myFragment);
                } else {
                    // 如果myFragment不为空，则直接将它显示出来
                    transaction.show(myFragment);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * 清除掉所有的选中状态。
     */
    private void clearSelection() {
        shipinImage.setImageResource(R.mipmap.movie);
        shipinText.setTextColor(Color.parseColor("#82858b"));
        bookImage.setImageResource(R.mipmap.book);
        bookText.setTextColor(Color.parseColor("#82858b"));
        zhuyeImage.setImageResource(R.mipmap.wuzi2);
        zhuyeText.setTextColor(Color.parseColor("#82858b"));
        jiejieImage.setImageResource(R.mipmap.xinxin);
        jiejieText.setTextColor(Color.parseColor("#82858b"));
        maimaiImage.setImageResource(R.mipmap.gouwuche);
        maimaiText.setTextColor(Color.parseColor("#82858b"));
        myImage.setImageResource(R.mipmap.my);
        myText.setTextColor(Color.parseColor("#82858b"));
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction 用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (shipinFragment != null) {
            transaction.hide(shipinFragment);
        }
        if (bookFragment != null) {
            transaction.hide(bookFragment);
        }
        if (zhuyeFragment != null) {
            transaction.hide(zhuyeFragment);
        }
        if (jiejieFragment != null) {
            transaction.hide(jiejieFragment);
        }
        if (maimaiFragment != null) {
            transaction.hide(maimaiFragment);
        }
        if (myFragment != null) {
            transaction.hide(myFragment);
        }
    }
}

