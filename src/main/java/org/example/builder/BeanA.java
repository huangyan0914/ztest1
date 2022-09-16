package org.example.builder;

import com.alibaba.fastjson.JSON;

public class BeanA {
    String name;
    String logo;
    String address;
    String zhizhao;
    String atime;
    String btime;
    String carType;
    String range;

    private BeanA(Builder builder) {
        name = builder.name;
        logo = builder.logo;
        address = builder.address;
        zhizhao = builder.zhizhao;
        atime = builder.atime;
        btime = builder.btime;
        carType = builder.carType;
        range = builder.range;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String logo;
        private String address;
        private String zhizhao;
        private String atime;
        private String btime;
        private String carType;
        private String range;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withLogo(String val) {
            logo = val;
            return this;
        }

        public Builder withAddress(String val) {
            address = val;
            return this;
        }

        public Builder withZhizhao(String val) {
            zhizhao = val;
            return this;
        }

        public Builder withAtime(String val) {
            atime = val;
            return this;
        }

        public Builder withBtime(String val) {
            btime = val;
            return this;
        }

        public Builder withCarType(String val) {
            carType = val;
            return this;
        }

        public Builder withRange(String val) {
            range = val;
            return this;
        }

        public BeanA build() {
            return new BeanA(this);
        }
    }

    public static void main(String[] args) {
        BeanA beanA = BeanA.newBuilder().withAddress("aa").build();
        System.out.println(JSON.toJSONString(beanA));
    }
}
