package kadai1808;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kadai08 {

//	カウント用変数とラベルを定義
	static int count = 0;
	static JLabel label = new JLabel(count + "回");

	public static void main(String[] args) {


		JFrame frame = new JFrame("08月後半課題");

		// 表示状態の設定
		frame.setVisible(true);

//		ウィンドウサイズの指定
		frame.setSize(400, 400);

		// ウィンドウの表示位置を中央に設定
		frame.setLocationRelativeTo(null);

//		ボタンレイアウトの設定
		frame.setLayout(new FlowLayout());

//		ボタンオブジェクトの生成及び表示名の設定
		JButton button1 = new JButton("カウントアップ");
		JButton button2 = new JButton("リセット");

//		ボタンをウィンドウに配置
		frame.add(button1);
		frame.add(button2);
//		ラベルをウィンドウに配置
		frame.add(label);

//		ボタンを押した際の動作
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				label.setText(count + "回");
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				label.setText(count + "回");
			}
		});

	}

}