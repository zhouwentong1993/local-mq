//package wx.lmp.client.config;
//
//import org.json.simple.parser.ParseException;
//import org.junit.Before;
//import org.junit.Test;
//import wx.mq.common.client.config.ConsumerOffsetManager;
//
///**
// * ConsumerOffsetManager 测试
// */
//public class ConsumerOffsetManagerTest {
//
//    ConsumerOffsetManager consumerOffsetManager;
//
//    @Before
//    public void setUp() {
//        this.consumerOffsetManager = new ConsumerOffsetManager(new LocalMessageStore(new MessageStoreConfig("/tmp")));
//    }
//
//    /**
//     * Description 测试编码
//     */
//    @Test
//    public void testEncode() {
//
//        this.consumerOffsetManager.commitOffset(
//                "127.0.0.1:0",
//                "TestTopic",
//                0,
//                0
//        );
//
//        this.consumerOffsetManager.commitOffset(
//                "127.0.0.1:0",
//                "TestTopic2",
//                1,
//                0
//        );
//
//        this.consumerOffsetManager.commitOffset(
//                "127.0.0.1:0",
//                "TestTopic2",
//                1,
//                3
//        );
//
//
//        System.out.println(this.consumerOffsetManager.encode());
//
//    }
//
//    @Test
//    public void testDecode() throws ParseException {
//        this.consumerOffsetManager.decode("{\"TestTopic\":{\"0\":0},\"TestTopic2\":{\"1\":3}}");
//
//        System.out.println(this.consumerOffsetManager.getOffsetTable());
//    }
//}
