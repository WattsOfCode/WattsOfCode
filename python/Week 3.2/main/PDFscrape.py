'''
Author John Deardorff
Date 08/13/2025
Application (program)
Description:
    for PDF scraping
    I chose a simple article to scrape from wiki 
    regaurding Link from the popular Nintendo 
    game The Legend of Zelda 
'''

import pdfplumber

print("Application start")

def pullpdf(pdf):
    pull = pdfplumber.open(pdf)
    return pull
def writepdf(pdf):
    f = open("Zelda.txt", "w", encoding='utf-8')
    for page in pdf.pages:
        f.write(page.extract_text())
    f.close

pdf = pullpdf("Week 3.2/Link.pdf")
writepdf(pdf)