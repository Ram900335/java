import javax.swing.*;  
public class Dell 
{
	public static void main(String args[])
	{
		JFrame f =new JFrame();

		final JLabel  l = new JLabel ();
		l.setHorizontalAlignment(l.CENTER);
		l.setSize(400,100);

		JButton b = new JButton("show");
		b.setBounds(100,100,75,20);
		b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String data = "the letter is :"
					+cb.getItemAt(cb.getSelectIndex());
					l.setText(data);
				}
			});

		String country[] = {"a","b","v","b","f"};
		JComboBox cb = new JComboBox(country);
		cb.setBounds(50,50,90,20);

		f.add(cb);f.add(b);f.add(l);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}