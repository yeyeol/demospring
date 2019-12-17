package com.imooc.demospring;

/**
 * @author linckye
 */
public class Proxy {

    public static B proxy(B b) {
        ProxyB proxyB = new ProxyB();
        proxyB.b = b;
        return proxyB;
    }

    private static class ProxyB implements B {

        private B b;

        @Override
        public void test() {
            System.out.println("before test");
            b.test();
            System.out.println("after test");
        }
    }

    public static void main(String[] args) {
        B b = new BImpl();
        b.test();
        System.out.println();
        B proxy = proxy(b);
        proxy.test();
    }

}
