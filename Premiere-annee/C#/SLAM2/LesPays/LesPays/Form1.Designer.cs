namespace LesPays
{
    partial class Form1
    {
        /// <summary>
        /// Variable nécessaire au concepteur.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Nettoyage des ressources utilisées.
        /// </summary>
        /// <param name="disposing">true si les ressources managées doivent être supprimées ; sinon, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Code généré par le Concepteur Windows Form

        /// <summary>
        /// Méthode requise pour la prise en charge du concepteur - ne modifiez pas
        /// le contenu de cette méthode avec l'éditeur de code.
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.radioOceanie = new System.Windows.Forms.RadioButton();
            this.radioEurope = new System.Windows.Forms.RadioButton();
            this.radioAsie = new System.Windows.Forms.RadioButton();
            this.radioAntarctique = new System.Windows.Forms.RadioButton();
            this.radioAmeriqueDuSud = new System.Windows.Forms.RadioButton();
            this.radioAmeriqueDuNord = new System.Windows.Forms.RadioButton();
            this.radioAfrique = new System.Windows.Forms.RadioButton();
            this.radioTous = new System.Windows.Forms.RadioButton();
            this.lstPays = new System.Windows.Forms.ListBox();
            this.label1 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.lblNomPays = new System.Windows.Forms.Label();
            this.imgDrapeau = new System.Windows.Forms.PictureBox();
            this.lblMonnaie = new System.Windows.Forms.Label();
            this.lblCapitale = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.imgDrapeau)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.radioOceanie);
            this.groupBox1.Controls.Add(this.radioEurope);
            this.groupBox1.Controls.Add(this.radioAsie);
            this.groupBox1.Controls.Add(this.radioAntarctique);
            this.groupBox1.Controls.Add(this.radioAmeriqueDuSud);
            this.groupBox1.Controls.Add(this.radioAmeriqueDuNord);
            this.groupBox1.Controls.Add(this.radioAfrique);
            this.groupBox1.Controls.Add(this.radioTous);
            this.groupBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(12, 32);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(190, 244);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Choix du continent";
            this.groupBox1.Enter += new System.EventHandler(this.groupBox1_Enter);
            // 
            // radioOceanie
            // 
            this.radioOceanie.AutoSize = true;
            this.radioOceanie.Location = new System.Drawing.Point(6, 191);
            this.radioOceanie.Name = "radioOceanie";
            this.radioOceanie.Size = new System.Drawing.Size(86, 24);
            this.radioOceanie.TabIndex = 7;
            this.radioOceanie.Text = "Océanie";
            this.radioOceanie.UseVisualStyleBackColor = true;
            this.radioOceanie.CheckedChanged += new System.EventHandler(this.radioOceanie_CheckedChanged);
            // 
            // radioEurope
            // 
            this.radioEurope.AutoSize = true;
            this.radioEurope.Location = new System.Drawing.Point(6, 168);
            this.radioEurope.Name = "radioEurope";
            this.radioEurope.Size = new System.Drawing.Size(79, 24);
            this.radioEurope.TabIndex = 1;
            this.radioEurope.Text = "Europe";
            this.radioEurope.UseVisualStyleBackColor = true;
            this.radioEurope.CheckedChanged += new System.EventHandler(this.radioEurope_CheckedChanged);
            // 
            // radioAsie
            // 
            this.radioAsie.AutoSize = true;
            this.radioAsie.Location = new System.Drawing.Point(6, 145);
            this.radioAsie.Name = "radioAsie";
            this.radioAsie.Size = new System.Drawing.Size(58, 24);
            this.radioAsie.TabIndex = 6;
            this.radioAsie.Text = "Asie";
            this.radioAsie.UseVisualStyleBackColor = true;
            this.radioAsie.CheckedChanged += new System.EventHandler(this.radioAsie_CheckedChanged);
            // 
            // radioAntarctique
            // 
            this.radioAntarctique.AutoSize = true;
            this.radioAntarctique.Location = new System.Drawing.Point(6, 122);
            this.radioAntarctique.Name = "radioAntarctique";
            this.radioAntarctique.Size = new System.Drawing.Size(109, 24);
            this.radioAntarctique.TabIndex = 5;
            this.radioAntarctique.Text = "Antarctique";
            this.radioAntarctique.UseVisualStyleBackColor = true;
            this.radioAntarctique.CheckedChanged += new System.EventHandler(this.radioAntarctique_CheckedChanged);
            // 
            // radioAmeriqueDuSud
            // 
            this.radioAmeriqueDuSud.AutoSize = true;
            this.radioAmeriqueDuSud.Location = new System.Drawing.Point(6, 99);
            this.radioAmeriqueDuSud.Name = "radioAmeriqueDuSud";
            this.radioAmeriqueDuSud.Size = new System.Drawing.Size(150, 24);
            this.radioAmeriqueDuSud.TabIndex = 4;
            this.radioAmeriqueDuSud.Text = "Amérique du Sud";
            this.radioAmeriqueDuSud.UseVisualStyleBackColor = true;
            this.radioAmeriqueDuSud.CheckedChanged += new System.EventHandler(this.radioAmeriqueDuSud_CheckedChanged);
            // 
            // radioAmeriqueDuNord
            // 
            this.radioAmeriqueDuNord.AutoSize = true;
            this.radioAmeriqueDuNord.Location = new System.Drawing.Point(6, 76);
            this.radioAmeriqueDuNord.Name = "radioAmeriqueDuNord";
            this.radioAmeriqueDuNord.Size = new System.Drawing.Size(155, 24);
            this.radioAmeriqueDuNord.TabIndex = 3;
            this.radioAmeriqueDuNord.Text = "Amérique du Nord";
            this.radioAmeriqueDuNord.UseVisualStyleBackColor = true;
            this.radioAmeriqueDuNord.CheckedChanged += new System.EventHandler(this.radioAmeriqueDuNord_CheckedChanged);
            // 
            // radioAfrique
            // 
            this.radioAfrique.AutoSize = true;
            this.radioAfrique.Location = new System.Drawing.Point(6, 53);
            this.radioAfrique.Name = "radioAfrique";
            this.radioAfrique.Size = new System.Drawing.Size(78, 24);
            this.radioAfrique.TabIndex = 2;
            this.radioAfrique.Text = "Afrique";
            this.radioAfrique.UseVisualStyleBackColor = true;
            this.radioAfrique.CheckedChanged += new System.EventHandler(this.radioAfrique_CheckedChanged);
            // 
            // radioTous
            // 
            this.radioTous.AutoSize = true;
            this.radioTous.Checked = true;
            this.radioTous.Location = new System.Drawing.Point(6, 30);
            this.radioTous.Name = "radioTous";
            this.radioTous.Size = new System.Drawing.Size(62, 24);
            this.radioTous.TabIndex = 1;
            this.radioTous.TabStop = true;
            this.radioTous.Text = "Tous";
            this.radioTous.UseVisualStyleBackColor = true;
            this.radioTous.CheckedChanged += new System.EventHandler(this.radioTous_CheckedChanged_1);
            // 
            // lstPays
            // 
            this.lstPays.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lstPays.FormattingEnabled = true;
            this.lstPays.ItemHeight = 20;
            this.lstPays.Location = new System.Drawing.Point(232, 55);
            this.lstPays.Name = "lstPays";
            this.lstPays.Size = new System.Drawing.Size(386, 224);
            this.lstPays.TabIndex = 1;
            this.lstPays.SelectedIndexChanged += new System.EventHandler(this.listBox1_SelectedIndexChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(228, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(110, 20);
            this.label1.TabIndex = 2;
            this.label1.Text = "Liste des pays";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.lblNomPays);
            this.groupBox2.Controls.Add(this.imgDrapeau);
            this.groupBox2.Controls.Add(this.lblMonnaie);
            this.groupBox2.Controls.Add(this.lblCapitale);
            this.groupBox2.Controls.Add(this.label3);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Controls.Add(this.label2);
            this.groupBox2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox2.Location = new System.Drawing.Point(12, 300);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(606, 234);
            this.groupBox2.TabIndex = 3;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Renseignement du pays";
            // 
            // lblNomPays
            // 
            this.lblNomPays.AutoSize = true;
            this.lblNomPays.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNomPays.Location = new System.Drawing.Point(29, 35);
            this.lblNomPays.Name = "lblNomPays";
            this.lblNomPays.Size = new System.Drawing.Size(79, 29);
            this.lblNomPays.TabIndex = 6;
            this.lblNomPays.Text = "label4";
            // 
            // imgDrapeau
            // 
            this.imgDrapeau.Location = new System.Drawing.Point(12, 83);
            this.imgDrapeau.Name = "imgDrapeau";
            this.imgDrapeau.Size = new System.Drawing.Size(161, 123);
            this.imgDrapeau.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.imgDrapeau.TabIndex = 5;
            this.imgDrapeau.TabStop = false;
            // 
            // lblMonnaie
            // 
            this.lblMonnaie.AutoSize = true;
            this.lblMonnaie.Location = new System.Drawing.Point(300, 165);
            this.lblMonnaie.Name = "lblMonnaie";
            this.lblMonnaie.Size = new System.Drawing.Size(0, 20);
            this.lblMonnaie.TabIndex = 4;
            this.lblMonnaie.Click += new System.EventHandler(this.label6_Click);
            // 
            // lblCapitale
            // 
            this.lblCapitale.AutoSize = true;
            this.lblCapitale.Location = new System.Drawing.Point(300, 107);
            this.lblCapitale.Name = "lblCapitale";
            this.lblCapitale.Size = new System.Drawing.Size(0, 20);
            this.lblCapitale.TabIndex = 3;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(216, 165);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(78, 20);
            this.label3.TabIndex = 2;
            this.label3.Text = "Monnaie :";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(216, 107);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(75, 20);
            this.label5.TabIndex = 1;
            this.label5.Text = "Capitale :";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(6, 35);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(0, 31);
            this.label2.TabIndex = 0;
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(543, 543);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 35);
            this.button1.TabIndex = 5;
            this.button1.Text = "&Quitter";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(630, 590);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.lstPays);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = "Les pays du monde";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.imgDrapeau)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton radioOceanie;
        private System.Windows.Forms.RadioButton radioEurope;
        private System.Windows.Forms.RadioButton radioAsie;
        private System.Windows.Forms.RadioButton radioAntarctique;
        private System.Windows.Forms.RadioButton radioAmeriqueDuSud;
        private System.Windows.Forms.RadioButton radioAmeriqueDuNord;
        private System.Windows.Forms.RadioButton radioAfrique;
        private System.Windows.Forms.RadioButton radioTous;
        private System.Windows.Forms.ListBox lstPays;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lblMonnaie;
        private System.Windows.Forms.Label lblCapitale;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.PictureBox imgDrapeau;
        private System.Windows.Forms.Label lblNomPays;
    }
}

