package com.haolong.hessian.client;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import com.haolong.hessian.api.entity.User;
import org.junit.Assert;

import java.io.*;

/**
 * @project: Study-RPC
 * @description: 测试Hessian RPC 的序列化方式
 * @author: haolong
 * @data: 2023/6/16 22:25
 */
public class TestHessianSerializable {
    public static void main(String[] args) throws IOException {
        String path = "E:\\Code\\Study-RPC\\rpc-hessian-client\\src\\main\\resources\\text";
        File file = new File(path);
        // 步骤一：进行序列化
        OutputStream os = new FileOutputStream(file);
        assert os != null;
        Hessian2Output hessian2Output = new Hessian2Output(os);
        User user = new User("haolong","123456");
        hessian2Output.writeObject(user);
        hessian2Output.flush();
        hessian2Output.close();
        // 步骤二：进行反序列化
        InputStream in = new FileInputStream(file);
        assert in != null;
        Hessian2Input hessian2Input = new Hessian2Input(in);
        User userTransform = (User) hessian2Input.readObject();
        System.out.println("userTransform = " + userTransform);
    }
}
