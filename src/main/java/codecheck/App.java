package codecheck;

public class App {
	public static void main(String[] args) {

		// 出力する文字列
		String output = "";

		// 数値a[i]
		int[] a = new int[args.length - 1];

		// 文字列 s[i]
		String[] s = new String[args.length - 1];

		// 対象の数値
		int target = 0;

		// 引数を数値と文字列の配列に格納
		for (int i = 0, l = args.length; i < l; i++) {
			if (i == args.length - 1) {
				// 引数の最後は対象の数値として設定
				target = Integer.parseInt(args[i]);
			} else {
				// 引数を数値と文字列に分割してそれぞれの配列格納
				String[] param = args[i].split(":");
				a[i] = Integer.parseInt(param[0]);
				s[i] = param[1];
			}
		}

		// 対象の数値が割り切れるかを判定
		for (int j = 0, l = args.length - 1; j < l; j++) {
			if (target % a[j] == 0) {
				output = output + s[j];
			}
		}

		// 対象の数値が全ての引数で割り切れない場合
		if (output.equals("")) {
			output = String.valueOf(target);
		}

		// 結果を出力
		System.out.println(output);
	}
}
