package dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.Entity.SecKillEntry;

/**
 * Created by Auser on 2017/4/12.
 */
public class DaoTest {

    public static void main(String[] args) {
        try {
            Reader reader = Resources.getResourceAsReader("dbSource/mybatis_config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Connection conn = sqlSession.getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from seckill");
            ResultSet result= pst.executeQuery();
            ResultSetMetaData md = result.getMetaData();//获取键名
            int columnCount = md.getColumnCount();//获取行的数量
            List<SecKillEntry> List = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            while (result.next()){
                SecKillEntry secKillEntry = new SecKillEntry();
                secKillEntry.setName(result.getObject("Name").toString());
                secKillEntry.setSeckillId(Long.valueOf(result.getObject("seckill_id").toString()));
                secKillEntry.setNumber(Long.valueOf(result.getObject("number").toString()));
                secKillEntry.setStartTime(sdf.parse(result.getObject("start_time").toString()));
                secKillEntry.setEndTime(sdf.parse(result.getObject("end_time").toString()));
                secKillEntry.setCreateTime(sdf.parse(result.getObject("create_time").toString()));
                List.add(secKillEntry);
            }
            System.out.println(List);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
