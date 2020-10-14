import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Soccer extends JFrame
{
    int c1 = 0; int c2 = 0;
    JPanel[] pnl = new JPanel[8];
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    protected String compare(int a, int b)
    {if (a>b) return "Winner: AC Milan";
    else if (a<b) return "Winner: Real Madrid";
    else return "Winner: DRAW";}
    public Soccer()
    {
        super("Soccer");
        setLayout(new GridLayout(2,4));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
            pnl[i].setLayout(new BorderLayout());
        }
        pnl[5].add(but1, BorderLayout.SOUTH);
        pnl[6].add(but2, BorderLayout.SOUTH);
        JLabel lbl2 = new JLabel("RESULT: 0x0");
        pnl[2].add(lbl2, BorderLayout.CENTER);
        JLabel lbl1 = new JLabel("Last Scorer: N/A");
        pnl[1].add(lbl1, BorderLayout.CENTER);
        JLabel lbl3 = new JLabel("Winner: DRAW");
        pnl[3].add(lbl3, BorderLayout.EAST);
        but1.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {c1++;
            lbl2.setText("RESULT: "+ c1+ "x"+c2);
            lbl1.setText("Last Scorer: AC Milan");
            lbl3.setText(compare(c1,c2));
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}

        });
        but2.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {c2++;
            lbl2.setText("RESULT: "+ c1+ "x"+c2);
            lbl1.setText("Last Scorer: Real Madrid");
            lbl3.setText(compare(c1,c2));}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}

        });
        setSize(800,400);
    }
    public static void main(String[]args)
    {
        new Soccer().setVisible(true);
    }
}