using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _05_07_2022_BackgroundWorker
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            CheckForIllegalCrossThreadCalls = false;
        }

        int sayac1 = 0, sayac2 = 0;

        private void backgroundWorker1_DoWork(object sender, DoWorkEventArgs e)
        {
            while (sayac1 < 100000)
            {
                sayac1++;
                label1.Text = sayac1.ToString();
                if (backgroundWorker1.CancellationPending)
                {
                    e.Cancel = true;
                    return;
                }
                   
            }
        }

        private void backgroundWorker2_DoWork(object sender, DoWorkEventArgs e)
        {
            while (sayac2 < 100000)
            {
                sayac2++;
                label2.Text = sayac2.ToString();

                if (backgroundWorker2.CancellationPending)
                {
                    e.Cancel = true;
                    return;
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(!backgroundWorker1.IsBusy)
                backgroundWorker1.RunWorkerAsync();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if(!backgroundWorker2.IsBusy)
                backgroundWorker2.RunWorkerAsync();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            backgroundWorker1.WorkerSupportsCancellation = true;
            backgroundWorker1.CancelAsync();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            backgroundWorker2.WorkerSupportsCancellation = true;
            backgroundWorker2.CancelAsync();
        }
    }
}
