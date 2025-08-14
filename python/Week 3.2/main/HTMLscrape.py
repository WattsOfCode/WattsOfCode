'''
Author John Deardorff
Date 08/13/2025
Application (program)
Description:
    for webscraping
'''

import requests
from bs4 import BeautifulSoup

print("Application start")

def readwebpage(url):
    try:
        output = requests.get(url)
        output.raise_for_status()
        return output
    except requests.RequestException as e:
        print(f"Error in fetching URL: {e}")
        return None

def parsehtml(html):
    if html is None:
        print("Cannot parse: No HTML content")
        return None
    parsed = BeautifulSoup(html.content,'html.parser')
    return parsed

def outputquotes(parsed):
    if parsed is None:
        print("failed or no parsed HTML to extract quotes from.")
        return
    quotes = parsed.find_all("div", class_="quote")
    for quote in quotes:
        text = quote.find("span", class_="text").text
        author = quote.find("small", class_="author").text
        print(text, author)

url = "http://quotes.toscrape.com/page/2/"
html = readwebpage(url)
parsed = parsehtml(html)
outputquotes(parsed)
print(html.text)