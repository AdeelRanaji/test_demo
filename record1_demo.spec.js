import { test, expect } from '@playwright/test';

test.use({
  viewport: {
    height: 650,
    width: 320
  }
});

test('test', async ({ page }) => {
  await page.goto('https://staging.rockzfx.com/');
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'About11', exact: true }).click();
  await page.getByText('RockzFX doesn’t just provide').nth(2).click();
  await page.getByText('RockzFX doesn’t just provide').nth(2).click();
  await page.getByText('RockzFX doesn’t just provide').nth(2).click();
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'Blog' }).click();
  await page.getByRole('heading', { name: 'Unlocking Success: A Guide to' }).click();
  await page.locator('.e-con-inner > div:nth-child(2)').first().click();
  await page.getByRole('link', { name: 'Blog' }).click();
  await page.getByRole('heading', { name: 'MASTERING DISCIPLINE: What' }).click();
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'Newsletters' }).click();
  await page.getByRole('heading', { name: 'The Path to Self-Mastery' }).click();
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'Courses' }).click();
  await page.getByRole('link', { name: 'Courses' }).click();
  await page.getByRole('link', { name: 'Courses' }).click();
  await page.getByRole('link', { name: 'NDS Academy' }).click();
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'Courses' }).click();
  await page.getByRole('link', { name: 'RockzFX Academy' }).click();
  await page.getByRole('button', { name: 'What i\'ll Teach You' }).click();
  await page.getByRole('button', { name: 'Who is this for?' }).click();
  await page.getByLabel('Next').click();
  await page.getByLabel('Next').click();
  await page.goto('https://staging.rockzfx.com/checkout/');
  await page.getByLabel('I have read and agree to the').check();
  await page.getByRole('button', { name: 'Sign up now' }).click();
  await page.frameLocator('iframe[name="__privateStripeFrame9627"]').getByPlaceholder('1234 1234 1234').click();
  await page.getByRole('link', { name: 'LOG IN' }).click();
  await page.locator('#user_name').click();
  await page.locator('#user_name').click();
  await page.locator('#user_name').fill('admin');
  await page.locator('html').click();
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'Courses' }).click();
  await page.getByRole('link', { name: 'Yearly Mastermind' }).click();
  const page1Promise = page.waitForEvent('popup');
  await page.getByRole('link', { name: 'Book your free Discovery Call' }).nth(1).click();
  const page1 = await page1Promise;
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'Courses' }).click();
  await page.getByRole('link', { name: 'RockzFX Academy' }).click();
  await page.getByRole('button', { name: 'Subscribe' }).click();
  await page.getByText('Subscribe to begin. Join 100k').click();
  await page.getByLabel('Menu Toggle').click();
  await page.getByRole('link', { name: 'FAQs' }).click();
  await page.locator('.e-con-inner > div:nth-child(2)').first().click();
  await page.getByRole('link', { name: 'About' }).click();
  await page.getByLabel('Menu Toggle').click();
});