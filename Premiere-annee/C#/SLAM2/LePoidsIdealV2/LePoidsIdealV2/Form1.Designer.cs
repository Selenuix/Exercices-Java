namespace LePoidsIdealV2
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
            this.cmdEffacer = new System.Windows.Forms.Button();
            this.cmdCalculer = new System.Windows.Forms.Button();
            this.checkListe = new System.Windows.Forms.CheckBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtTaille = new System.Windows.Forms.TextBox();
            this.txtNom = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.radioHomme = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.radioFemme = new System.Windows.Forms.RadioButton();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.cmdVider = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.listPersonnes = new System.Windows.Forms.ListBox();
            this.lblPoids = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.cmdQuitter = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.cmdEffacer);
            this.groupBox1.Controls.Add(this.cmdCalculer);
            this.groupBox1.Controls.Add(this.checkListe);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.txtTaille);
            this.groupBox1.Controls.Add(this.txtNom);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.radioHomme);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.radioFemme);
            this.groupBox1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(21, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(427, 184);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Renseignements de la personne";
            this.groupBox1.Enter += new System.EventHandler(this.GroupBox1_Enter);
            // 
            // cmdEffacer
            // 
            this.cmdEffacer.Location = new System.Drawing.Point(331, 143);
            this.cmdEffacer.Name = "cmdEffacer";
            this.cmdEffacer.Size = new System.Drawing.Size(75, 32);
            this.cmdEffacer.TabIndex = 5;
            this.cmdEffacer.Text = "&Effacer";
            this.cmdEffacer.UseVisualStyleBackColor = true;
            this.cmdEffacer.Click += new System.EventHandler(this.CmdEffacer_Click);
            // 
            // cmdCalculer
            // 
            this.cmdCalculer.Location = new System.Drawing.Point(331, 99);
            this.cmdCalculer.Name = "cmdCalculer";
            this.cmdCalculer.Size = new System.Drawing.Size(75, 38);
            this.cmdCalculer.TabIndex = 4;
            this.cmdCalculer.Text = "&Calculer";
            this.cmdCalculer.UseVisualStyleBackColor = true;
            this.cmdCalculer.Click += new System.EventHandler(this.CmdCalculer_Click);
            // 
            // checkListe
            // 
            this.checkListe.AutoSize = true;
            this.checkListe.Location = new System.Drawing.Point(197, 113);
            this.checkListe.Name = "checkListe";
            this.checkListe.Size = new System.Drawing.Size(128, 24);
            this.checkListe.TabIndex = 1;
            this.checkListe.Text = "Mettre en liste";
            this.checkListe.UseVisualStyleBackColor = true;
            this.checkListe.CheckedChanged += new System.EventHandler(this.CheckListe_CheckedChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(138, 110);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(30, 20);
            this.label3.TabIndex = 1;
            this.label3.Text = "cm";
            this.label3.Click += new System.EventHandler(this.Label3_Click);
            // 
            // txtTaille
            // 
            this.txtTaille.Location = new System.Drawing.Point(79, 107);
            this.txtTaille.Name = "txtTaille";
            this.txtTaille.Size = new System.Drawing.Size(53, 26);
            this.txtTaille.TabIndex = 1;
            // 
            // txtNom
            // 
            this.txtNom.Location = new System.Drawing.Point(79, 70);
            this.txtNom.Name = "txtNom";
            this.txtNom.Size = new System.Drawing.Size(108, 26);
            this.txtNom.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(23, 110);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Taille :";
            // 
            // radioHomme
            // 
            this.radioHomme.AutoSize = true;
            this.radioHomme.Location = new System.Drawing.Point(126, 31);
            this.radioHomme.Name = "radioHomme";
            this.radioHomme.Size = new System.Drawing.Size(83, 24);
            this.radioHomme.TabIndex = 2;
            this.radioHomme.Text = "Homme";
            this.radioHomme.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(32, 73);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(42, 20);
            this.label1.TabIndex = 1;
            this.label1.Text = "Nom";
            // 
            // radioFemme
            // 
            this.radioFemme.AutoSize = true;
            this.radioFemme.Checked = true;
            this.radioFemme.Location = new System.Drawing.Point(35, 31);
            this.radioFemme.Name = "radioFemme";
            this.radioFemme.Size = new System.Drawing.Size(81, 24);
            this.radioFemme.TabIndex = 1;
            this.radioFemme.TabStop = true;
            this.radioFemme.Text = "Femme";
            this.radioFemme.UseVisualStyleBackColor = true;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.cmdVider);
            this.groupBox2.Controls.Add(this.label6);
            this.groupBox2.Controls.Add(this.listPersonnes);
            this.groupBox2.Controls.Add(this.lblPoids);
            this.groupBox2.Controls.Add(this.label4);
            this.groupBox2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox2.Location = new System.Drawing.Point(21, 217);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(427, 181);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Résultats";
            // 
            // cmdVider
            // 
            this.cmdVider.Location = new System.Drawing.Point(256, 142);
            this.cmdVider.Name = "cmdVider";
            this.cmdVider.Size = new System.Drawing.Size(111, 33);
            this.cmdVider.TabIndex = 9;
            this.cmdVider.Text = "&Vider la liste";
            this.cmdVider.UseVisualStyleBackColor = true;
            this.cmdVider.Click += new System.EventHandler(this.CmdVider_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(133, 16);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(152, 20);
            this.label6.TabIndex = 8;
            this.label6.Text = "Liste des personnes";
            this.label6.Click += new System.EventHandler(this.Label6_Click);
            // 
            // listPersonnes
            // 
            this.listPersonnes.Font = new System.Drawing.Font("Courier New", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listPersonnes.FormattingEnabled = true;
            this.listPersonnes.ItemHeight = 18;
            this.listPersonnes.Location = new System.Drawing.Point(137, 39);
            this.listPersonnes.Name = "listPersonnes";
            this.listPersonnes.Size = new System.Drawing.Size(284, 76);
            this.listPersonnes.TabIndex = 7;
            this.listPersonnes.SelectedIndexChanged += new System.EventHandler(this.ListBox1_SelectedIndexChanged);
            // 
            // lblPoids
            // 
            this.lblPoids.AutoSize = true;
            this.lblPoids.BackColor = System.Drawing.Color.Lime;
            this.lblPoids.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.lblPoids.Location = new System.Drawing.Point(39, 96);
            this.lblPoids.Name = "lblPoids";
            this.lblPoids.Size = new System.Drawing.Size(46, 22);
            this.lblPoids.TabIndex = 6;
            this.lblPoids.Text = "... Kg";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(16, 57);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(85, 20);
            this.label4.TabIndex = 0;
            this.label4.Text = "Poids idéal";
            this.label4.Click += new System.EventHandler(this.Label4_Click);
            // 
            // cmdQuitter
            // 
            this.cmdQuitter.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmdQuitter.Location = new System.Drawing.Point(313, 408);
            this.cmdQuitter.Name = "cmdQuitter";
            this.cmdQuitter.Size = new System.Drawing.Size(75, 31);
            this.cmdQuitter.TabIndex = 10;
            this.cmdQuitter.Text = "&Quitter";
            this.cmdQuitter.UseVisualStyleBackColor = true;
            this.cmdQuitter.Click += new System.EventHandler(this.CmdQuitter_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(488, 445);
            this.Controls.Add(this.cmdQuitter);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Le poids idéal v2";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.RadioButton radioHomme;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.RadioButton radioFemme;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtTaille;
        private System.Windows.Forms.TextBox txtNom;
        private System.Windows.Forms.CheckBox checkListe;
        private System.Windows.Forms.Button cmdEffacer;
        private System.Windows.Forms.Button cmdCalculer;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label lblPoids;
        private System.Windows.Forms.ListBox listPersonnes;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button cmdVider;
        private System.Windows.Forms.Button cmdQuitter;
    }
}

