package Screen;

import java.awt.Button;
import javax.swing.*;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Timer;

import resourse.CapacityResource;
import resourse.TicketGateTask;

public class AwtScreen {
	CapacityResource cap ;
	@SuppressWarnings("unused")
	private TicketGateTask gateA, gateB,gateC,gateD;
	private Button buttonA, buttonB,buttonC,buttonD,buttonDecA,buttonDecB,buttonDecC,buttonDecD;
	private Frame frame;
	private Label labelA, labelB,labelC,labelD,rateNow,labelDecremmentA,labelDecremmentB,labelDecremmentC,labelDecremmentD;
	private TextField textFieldA, textFieldB,textFieldC,textFieldD;
	private Timer timer;
	
	
	public AwtScreen(TicketGateTask gateA, TicketGateTask gateB,TicketGateTask gateC,TicketGateTask gateD) {
		super();
		this.gateA = gateA;
		this.gateB = gateB;
		this.gateC = gateC;
		this.gateD = gateD;
		this.buttonA = new Button("Gate A");
		this.buttonB = new Button("Gate B");
		this.buttonC = new Button("Gate C");
		this.buttonD = new Button("Gate D");
		this.buttonDecA = new Button("decrementA");
		this.buttonDecB = new Button("decrementB");
		this.buttonDecC = new Button("decrementC");
		this.buttonDecD = new Button("decrementD");
		this.labelA = new Label();
		this.labelB = new Label();
		this.labelC = new Label();
		this.labelD = new Label();
		this.labelDecremmentA = new Label();
		this.labelDecremmentB = new Label();
		this.labelDecremmentC = new Label();
		this.labelDecremmentD = new Label();
		this.rateNow = new Label();
		this.textFieldA = new TextField();
		this.textFieldB = new TextField();
		this.textFieldC = new TextField();
		this.textFieldD = new TextField();
		
		frame = new Frame("Controle Catraca");
		frame.setSize(1300, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		
		frame.add(buttonA);
		frame.add(labelA);
		frame.add(textFieldA);
		
		frame.add(buttonB);
		frame.add(labelB);
		frame.add(textFieldB);
		
		frame.add(buttonC);
		frame.add(labelC);
		frame.add(textFieldC);
		
		frame.add(buttonD);
		frame.add(labelD);
		frame.add(textFieldD);
		
		frame.add(rateNow);
		//frame.add(labelDecremment);
		frame.add(buttonDecA);
		frame.add(buttonDecB);
		frame.add(buttonDecC);
		frame.add(buttonDecD);
		
		frame.addWindowListener( new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("GUI Finalizada");
				System.out.println("CLI Finalizada");
				System.exit(0);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Components Position 
		textFieldA.setBounds(25, 100, 200, 25); // onde começa em x, começa em y , largura, altura
		buttonA.setBounds(25, 150, 200, 25);
		labelA.setBounds(25, 200, 200, 25);

		textFieldB.setBounds(250, 100, 200, 25);
		buttonB.setBounds(250, 150, 200, 25);
		labelB.setBounds(250, 200, 200, 25);
		
		textFieldC.setBounds(475, 100, 200, 25);
		buttonC.setBounds(475, 150, 200, 25);
		labelC.setBounds(475, 200, 200, 25);
		
		textFieldD.setBounds(700, 100, 200, 25);
		buttonD.setBounds(700, 150, 200, 25);
		labelD.setBounds(700, 200, 200, 25);
		
		rateNow.setBounds(925,100,200,25);
		labelDecremmentA.setBounds(700,300,400,50);
		labelDecremmentB.setBounds(250, 300, 200, 25);
		buttonDecA.setBounds(25, 250, 200, 25);
		buttonDecB.setBounds(250, 250, 200, 25);
		buttonDecC.setBounds(475, 250, 200, 25);
		buttonDecD.setBounds(700, 250, 200, 25);
		
		//Configurar Ações do Botões
		buttonA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int msg= Integer.parseInt(textFieldA.getText());
				System.out.println(msg);
				gateA.setPeopleRate(msg);
			}
		});
		
		
		buttonB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int msg= Integer.parseInt(textFieldB.getText());
				System.out.println(msg);
				gateB.setPeopleRate(msg);
			}
		});
		buttonC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int msg= Integer.parseInt(textFieldC.getText());
				System.out.println(msg);
				gateC.setPeopleRate(msg);
			}
		});
		buttonD.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				int msg= Integer.parseInt(textFieldD.getText());
				System.out.println(msg);
				gateD.setPeopleRate(msg);
	}
});
		
		buttonDecA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
			
			int msg=gateA.getPeopleRate();
			msg--;
			gateA.setPeopleRate(msg);
		       
		    textFieldA.setText(""+gateA.peopleRate);
		     
			
			
		        
			}
});
		
		
		
		buttonDecB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
			
			int msg=gateB.getPeopleRate();
			msg--;
			gateB.setPeopleRate(msg);
		       
		    textFieldB.setText(""+gateB.peopleRate);
		     
			
			
		        
			}
});
		
		buttonDecC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
			
			int msg=gateC.getPeopleRate();
			msg--;
			gateC.setPeopleRate(msg);
		       
		    textFieldC.setText(""+gateC.peopleRate);
		     
			
			
		        
			}
});		
		
		buttonDecD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
			
			int msg=gateD.getPeopleRate();
			msg--;
			gateD.setPeopleRate(msg);
		       
		    textFieldD.setText(""+gateD.peopleRate);
		     
			
			
		        
			}
});
		//Configuração Timer
		timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				labelA.setText(gateA.getGateName().toString()+" -- "+ gateA.peopleRate);
				labelB.setText(gateB.getGateName().toString()+" -- "+ gateB.peopleRate);
				labelC.setText(gateC.getGateName().toString()+" -- "+ gateC.peopleRate);
				labelD.setText(gateD.getGateName().toString()+" -- "+ gateD.peopleRate);
				labelDecremmentA.setText(""+gateA.peopleRate);
				labelDecremmentB.setText(""+gateB.peopleRate);
				labelDecremmentC.setText(""+gateC.peopleRate);
				labelDecremmentD.setText(""+gateD.peopleRate);
				
				int sum = gateA.peopleRate + gateB.peopleRate + gateC.peopleRate + gateD.peopleRate;
				if (sum>=500) {
					rateNow.setText("LOTADA" + " -- Nº Pessoas:"+ sum);
					
				}
				else {
					rateNow.setText("HÁ VAGAS"+ " -- Nº Pessoas:"+ sum);
				}
				
			}
		});
		timer.start();
	}
	
}

