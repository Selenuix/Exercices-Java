namespace GestionFilms
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
            this.listeFilms = new System.Windows.Forms.ListBox();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.txtGenreFilm = new System.Windows.Forms.TextBox();
            this.txtSupportFilm = new System.Windows.Forms.TextBox();
            this.txtNumeroFilm = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.lblNomFilm = new System.Windows.Forms.Label();
            this.pictureFilm = new System.Windows.Forms.PictureBox();
            this.button1 = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureFilm)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.listeFilms);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(475, 195);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Liste des films";
            // 
            // listeFilms
            // 
            this.listeFilms.FormattingEnabled = true;
            this.listeFilms.Location = new System.Drawing.Point(14, 19);
            this.listeFilms.Name = "listeFilms";
            this.listeFilms.Size = new System.Drawing.Size(455, 160);
            this.listeFilms.TabIndex = 8;
            this.listeFilms.SelectedIndexChanged += new System.EventHandler(this.listBox1_SelectedIndexChanged);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.txtGenreFilm);
            this.groupBox2.Controls.Add(this.txtSupportFilm);
            this.groupBox2.Controls.Add(this.txtNumeroFilm);
            this.groupBox2.Controls.Add(this.label4);
            this.groupBox2.Controls.Add(this.label3);
            this.groupBox2.Controls.Add(this.label2);
            this.groupBox2.Controls.Add(this.lblNomFilm);
            this.groupBox2.Controls.Add(this.pictureFilm);
            this.groupBox2.Location = new System.Drawing.Point(12, 257);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(475, 234);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Informations du film";
            // 
            // txtGenreFilm
            // 
            this.txtGenreFilm.Enabled = false;
            this.txtGenreFilm.Location = new System.Drawing.Point(273, 159);
            this.txtGenreFilm.Name = "txtGenreFilm";
            this.txtGenreFilm.Size = new System.Drawing.Size(100, 20);
            this.txtGenreFilm.TabIndex = 7;
            // 
            // txtSupportFilm
            // 
            this.txtSupportFilm.Enabled = false;
            this.txtSupportFilm.Location = new System.Drawing.Point(273, 132);
            this.txtSupportFilm.Name = "txtSupportFilm";
            this.txtSupportFilm.Size = new System.Drawing.Size(100, 20);
            this.txtSupportFilm.TabIndex = 6;
            // 
            // txtNumeroFilm
            // 
            this.txtNumeroFilm.Enabled = false;
            this.txtNumeroFilm.Location = new System.Drawing.Point(273, 102);
            this.txtNumeroFilm.Name = "txtNumeroFilm";
            this.txtNumeroFilm.Size = new System.Drawing.Size(100, 20);
            this.txtNumeroFilm.TabIndex = 5;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(193, 162);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(36, 13);
            this.label4.TabIndex = 4;
            this.label4.Text = "Genre";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(193, 132);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(44, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "Support";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(193, 105);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(38, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Film n°";
            // 
            // lblNomFilm
            // 
            this.lblNomFilm.AutoSize = true;
            this.lblNomFilm.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNomFilm.Location = new System.Drawing.Point(193, 33);
            this.lblNomFilm.Name = "lblNomFilm";
            this.lblNomFilm.Size = new System.Drawing.Size(0, 20);
            this.lblNomFilm.TabIndex = 1;
            // 
            // pictureFilm
            // 
            this.pictureFilm.Location = new System.Drawing.Point(6, 33);
            this.pictureFilm.Name = "pictureFilm";
            this.pictureFilm.Size = new System.Drawing.Size(128, 183);
            this.pictureFilm.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureFilm.TabIndex = 0;
            this.pictureFilm.TabStop = false;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(389, 513);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(98, 23);
            this.button1.TabIndex = 5;
            this.button1.Text = "Nouveau film";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(506, 548);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = "Gestion des films";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureFilm)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.PictureBox pictureFilm;
        private System.Windows.Forms.Label lblNomFilm;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox txtGenreFilm;
        private System.Windows.Forms.TextBox txtSupportFilm;
        private System.Windows.Forms.TextBox txtNumeroFilm;
        private System.Windows.Forms.ListBox listeFilms;
    }
}

