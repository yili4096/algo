import java.util.HashSet;
import java.util.Set;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "中国";
		for (char c : s.toCharArray()) {
			//System.out.println(c);
		}
		
		String str = "长 短 高 低 方 圆 黑 白 红 绿 黄 蓝 灰 齐王想， 我的皮肤不痛也不痒， 怎么会有病呢？ 就摇摇头对扁鹊说：”先生，你错了， 我很健康， 什么病也没有。";
		
		

		String result = str.replaceAll("\\p{Punct}", "");
		System.out.println(result);
		
		
		Set<String> strSet = new HashSet<String>();
		for(String c : str.split("")) {
			strSet.add(c);
		}
		String strConverted = String.join(",", strSet);
		System.out.println(strConverted);
	}

}
