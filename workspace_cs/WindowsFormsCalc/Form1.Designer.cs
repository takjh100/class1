﻿namespace WindowsFormsCalc
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.display = new System.Windows.Forms.Label();
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.button6 = new System.Windows.Forms.Button();
            this.button7 = new System.Windows.Forms.Button();
            this.button8 = new System.Windows.Forms.Button();
            this.button9 = new System.Windows.Forms.Button();
            this.button10 = new System.Windows.Forms.Button();
            this.button11 = new System.Windows.Forms.Button();
            this.button12 = new System.Windows.Forms.Button();
            this.button13 = new System.Windows.Forms.Button();
            this.button14 = new System.Windows.Forms.Button();
            this.button16 = new System.Windows.Forms.Button();
            this.button17 = new System.Windows.Forms.Button();
            this.button15 = new System.Windows.Forms.Button();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // display
            // 
            this.display.Dock = System.Windows.Forms.DockStyle.Top;
            this.display.Font = new System.Drawing.Font("굴림", 45F);
            this.display.Location = new System.Drawing.Point(0, 0);
            this.display.Name = "display";
            this.display.Size = new System.Drawing.Size(384, 84);
            this.display.TabIndex = 0;
            this.display.Text = "0";
            this.display.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            this.display.Click += new System.EventHandler(this.label1_Click);
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.button17, 2, 3);
            this.tableLayoutPanel1.Controls.Add(this.button16, 3, 3);
            this.tableLayoutPanel1.Controls.Add(this.button9, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.button14, 1, 3);
            this.tableLayoutPanel1.Controls.Add(this.button12, 3, 2);
            this.tableLayoutPanel1.Controls.Add(this.button8, 3, 1);
            this.tableLayoutPanel1.Controls.Add(this.button7, 2, 1);
            this.tableLayoutPanel1.Controls.Add(this.button6, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.button5, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.button4, 3, 0);
            this.tableLayoutPanel1.Controls.Add(this.button13, 0, 3);
            this.tableLayoutPanel1.Controls.Add(this.button1, 0, 2);
            this.tableLayoutPanel1.Controls.Add(this.button3, 2, 2);
            this.tableLayoutPanel1.Controls.Add(this.button10, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.button2, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.button11, 2, 0);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 84);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 4;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(384, 307);
            this.tableLayoutPanel1.TabIndex = 1;
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("굴림", 30F);
            this.button1.Location = new System.Drawing.Point(3, 155);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(90, 70);
            this.button1.TabIndex = 0;
            this.button1.Text = "1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("굴림", 30F);
            this.button2.Location = new System.Drawing.Point(99, 155);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(90, 70);
            this.button2.TabIndex = 1;
            this.button2.Text = "2";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Font = new System.Drawing.Font("굴림", 30F);
            this.button3.Location = new System.Drawing.Point(195, 155);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(90, 70);
            this.button3.TabIndex = 2;
            this.button3.Text = "3";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // button4
            // 
            this.button4.Font = new System.Drawing.Font("굴림", 30F);
            this.button4.Location = new System.Drawing.Point(291, 3);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(90, 70);
            this.button4.TabIndex = 3;
            this.button4.Text = "/";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.button4_Click);
            // 
            // button5
            // 
            this.button5.Font = new System.Drawing.Font("굴림", 30F);
            this.button5.Location = new System.Drawing.Point(3, 79);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(90, 70);
            this.button5.TabIndex = 4;
            this.button5.Text = "4";
            this.button5.UseVisualStyleBackColor = true;
            this.button5.Click += new System.EventHandler(this.button5_Click);
            // 
            // button6
            // 
            this.button6.Font = new System.Drawing.Font("굴림", 30F);
            this.button6.Location = new System.Drawing.Point(99, 79);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(90, 70);
            this.button6.TabIndex = 5;
            this.button6.Text = "5";
            this.button6.UseVisualStyleBackColor = true;
            this.button6.Click += new System.EventHandler(this.button6_Click);
            // 
            // button7
            // 
            this.button7.Font = new System.Drawing.Font("굴림", 30F);
            this.button7.Location = new System.Drawing.Point(195, 79);
            this.button7.Name = "button7";
            this.button7.Size = new System.Drawing.Size(90, 70);
            this.button7.TabIndex = 6;
            this.button7.Text = "6";
            this.button7.UseVisualStyleBackColor = true;
            this.button7.Click += new System.EventHandler(this.button7_Click);
            // 
            // button8
            // 
            this.button8.Font = new System.Drawing.Font("굴림", 30F);
            this.button8.Location = new System.Drawing.Point(291, 79);
            this.button8.Name = "button8";
            this.button8.Size = new System.Drawing.Size(90, 70);
            this.button8.TabIndex = 7;
            this.button8.Text = "*";
            this.button8.UseVisualStyleBackColor = true;
            this.button8.Click += new System.EventHandler(this.button8_Click);
            // 
            // button9
            // 
            this.button9.Font = new System.Drawing.Font("굴림", 30F);
            this.button9.Location = new System.Drawing.Point(3, 3);
            this.button9.Name = "button9";
            this.button9.Size = new System.Drawing.Size(90, 70);
            this.button9.TabIndex = 8;
            this.button9.Text = "7";
            this.button9.UseVisualStyleBackColor = true;
            this.button9.Click += new System.EventHandler(this.button9_Click);
            // 
            // button10
            // 
            this.button10.Font = new System.Drawing.Font("굴림", 30F);
            this.button10.Location = new System.Drawing.Point(99, 3);
            this.button10.Name = "button10";
            this.button10.Size = new System.Drawing.Size(90, 70);
            this.button10.TabIndex = 9;
            this.button10.Text = "8";
            this.button10.UseVisualStyleBackColor = true;
            this.button10.Click += new System.EventHandler(this.button10_Click);
            // 
            // button11
            // 
            this.button11.Font = new System.Drawing.Font("굴림", 30F);
            this.button11.Location = new System.Drawing.Point(195, 3);
            this.button11.Name = "button11";
            this.button11.Size = new System.Drawing.Size(90, 70);
            this.button11.TabIndex = 10;
            this.button11.Text = "9";
            this.button11.UseVisualStyleBackColor = true;
            this.button11.Click += new System.EventHandler(this.button11_Click);
            // 
            // button12
            // 
            this.button12.Font = new System.Drawing.Font("굴림", 30F);
            this.button12.Location = new System.Drawing.Point(291, 155);
            this.button12.Name = "button12";
            this.button12.Size = new System.Drawing.Size(90, 70);
            this.button12.TabIndex = 11;
            this.button12.Text = "-";
            this.button12.UseVisualStyleBackColor = true;
            this.button12.Click += new System.EventHandler(this.button12_Click);
            // 
            // button13
            // 
            this.button13.Font = new System.Drawing.Font("굴림", 30F);
            this.button13.Location = new System.Drawing.Point(3, 231);
            this.button13.Name = "button13";
            this.button13.Size = new System.Drawing.Size(90, 73);
            this.button13.TabIndex = 12;
            this.button13.Text = "AC";
            this.button13.UseVisualStyleBackColor = true;
            this.button13.Click += new System.EventHandler(this.button13_Click);
            // 
            // button14
            // 
            this.button14.Font = new System.Drawing.Font("굴림", 30F);
            this.button14.Location = new System.Drawing.Point(99, 231);
            this.button14.Name = "button14";
            this.button14.Size = new System.Drawing.Size(90, 73);
            this.button14.TabIndex = 13;
            this.button14.Text = "0";
            this.button14.UseVisualStyleBackColor = true;
            this.button14.Click += new System.EventHandler(this.button14_Click);
            // 
            // button16
            // 
            this.button16.Font = new System.Drawing.Font("굴림", 30F);
            this.button16.Location = new System.Drawing.Point(291, 231);
            this.button16.Name = "button16";
            this.button16.Size = new System.Drawing.Size(90, 73);
            this.button16.TabIndex = 15;
            this.button16.Text = "+";
            this.button16.UseVisualStyleBackColor = true;
            this.button16.Click += new System.EventHandler(this.button16_Click);
            // 
            // button17
            // 
            this.button17.Font = new System.Drawing.Font("굴림", 30F);
            this.button17.Location = new System.Drawing.Point(195, 231);
            this.button17.Name = "button17";
            this.button17.Size = new System.Drawing.Size(90, 73);
            this.button17.TabIndex = 16;
            this.button17.Text = ".";
            this.button17.UseVisualStyleBackColor = true;
            this.button17.Click += new System.EventHandler(this.button17_Click);
            // 
            // button15
            // 
            this.button15.Font = new System.Drawing.Font("굴림", 30F);
            this.button15.Location = new System.Drawing.Point(0, 394);
            this.button15.Name = "button15";
            this.button15.Size = new System.Drawing.Size(384, 73);
            this.button15.TabIndex = 14;
            this.button15.Text = "=";
            this.button15.UseVisualStyleBackColor = true;
            this.button15.Click += new System.EventHandler(this.button15_Click);
            // 
            // Form1
            // 
            this.ClientSize = new System.Drawing.Size(384, 461);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Controls.Add(this.button15);
            this.Controls.Add(this.display);
            this.Name = "Form1";
            this.Text = "form1";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }


        #endregion

        private System.Windows.Forms.Label display;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button16;
        private System.Windows.Forms.Button button14;
        private System.Windows.Forms.Button button13;
        private System.Windows.Forms.Button button12;
        private System.Windows.Forms.Button button11;
        private System.Windows.Forms.Button button10;
        private System.Windows.Forms.Button button9;
        private System.Windows.Forms.Button button8;
        private System.Windows.Forms.Button button7;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button17;
        private System.Windows.Forms.Button button15;
    }
}

