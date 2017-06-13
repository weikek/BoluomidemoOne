package jiyun.com.boluomidemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by 魏柯柯 on 2017/6/12.
 */
public class RegistActivity extends Activity {
    @Bind(R.id.img_return)
    ImageView imgReturn;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.regist_name)
    EditText registName;
    @Bind(R.id.regist_password)
    EditText registPassword;
    @Bind(R.id.regist_password2)
    EditText registPassword2;
    @Bind(R.id.bt_regist)
    Button btRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_return, R.id.bt_regist})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return:
                finish();
                break;
            case R.id.bt_regist:

                break;
        }
    }
}
